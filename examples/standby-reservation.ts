/**
 * SRT Standby Reservation Example
 * This example shows how to use the standby reservation feature when trains are sold out
 */

import { SRT, Adult, SeatType } from '../src';

async function main() {
  try {
    // 1. Login
    const srt = new SRT('your_id', 'your_password');
    await srt.login();

    // 2. Search trains (including sold-out trains)
    const trains = await srt.searchTrain(
      '수서',
      '부산',
      '20250201',
      '100000',
      undefined,
      [Adult(1)],
      false // Include sold-out trains
    );

    console.log('\n=== All Trains (Including Sold Out) ===');
    trains.forEach((train, index) => {
      console.log(`${index + 1}. ${train.toString()}`);
      console.log(`   Standby Available: ${train.reserveStandbyAvailable()}`);
    });

    // 3. Find a sold-out train with standby available
    const soldOutTrain = trains.find(
      train => !train.seatAvailable() && train.reserveStandbyAvailable()
    );

    if (!soldOutTrain) {
      console.log('\nNo sold-out trains with standby reservation available');
      return;
    }

    console.log(`\n=== Selected Train for Standby ===`);
    console.log(soldOutTrain.toString());

    // 4. Request standby reservation
    const reservation = await srt.reserveStandby(
      soldOutTrain,
      [Adult(1)],
      SeatType.GENERAL_FIRST,
      '010-1234-5678' // Phone number for notification
    );

    console.log('\n=== Standby Reservation Success ===');
    console.log(reservation.toString());
    console.log(`Reservation Number: ${reservation.reservationNumber}`);

    // 5. Configure standby options
    await srt.reserveStandbyOptionSettings(
      reservation,
      true,  // Agree to SMS notification
      true,  // Agree to seat class change
      '010-1234-5678'
    );

    console.log('\n=== Standby Options Configured ===');
    console.log('- SMS notifications enabled');
    console.log('- Seat class change allowed');

    // 6. Check reservation status
    const allReservations = await srt.getReservations();
    const standbyReservation = allReservations.find(
      r => r.reservationNumber === reservation.reservationNumber
    );

    if (standbyReservation) {
      console.log('\n=== Current Status ===');
      console.log(standbyReservation.toString());
      console.log(`Is Waiting: ${standbyReservation.isWaiting}`);
    }

    // 7. Logout
    await srt.logout();

  } catch (error) {
    console.error('Error:', error);
  }
}

// Run the example
if (require.main === module) {
  main();
}
