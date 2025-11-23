/**
 * Basic SRT reservation example
 */

import { SRT, Adult, Child, SeatType } from '../src';

async function main() {
  try {
    // 1. Login
    const srt = new SRT('your_id', 'your_password');
    await srt.login();

    // 2. Search trains
    const trains = await srt.searchTrain(
      '수서',      // Departure
      '부산',      // Arrival
      '20250201', // Date (YYYYMMDD)
      '100000',   // Time (HHMMSS)
      undefined,  // Time limit
      [Adult(2), Child(1)] // Passengers
    );

    // 3. Display train information
    console.log('\n=== Available Trains ===');
    trains.forEach((train, index) => {
      console.log(`${index + 1}. ${train.toString()}`);
    });

    if (trains.length === 0) {
      console.log('No available trains found');
      return;
    }

    // 4. Reserve the first available train
    const reservation = await srt.reserve(
      trains[0],
      [Adult(2), Child(1)],
      SeatType.GENERAL_FIRST
    );

    console.log('\n=== Reservation Success ===');
    console.log(reservation.toString());
    console.log(`Reservation Number: ${reservation.reservationNumber}`);
    console.log(`Total Cost: ${reservation.totalCost}원`);

    // 5. Get ticket details
    const tickets = await srt.ticketInfo(reservation);
    console.log('\n=== Ticket Details ===');
    tickets.forEach(ticket => {
      console.log(ticket.toString());
    });

    // 6. Optional: Pay with card
    // const paymentSuccess = await srt.payWithCard(
    //   reservation,
    //   '1234567890123456',  // Card number
    //   '12',                // First 2 digits of password
    //   '981204',            // Birth date or business number
    //   '2512',              // Expiry date (YYMM)
    //   0,                   // Installment (0 for one-time payment)
    //   'J'                  // Card type (J=personal, S=corporate)
    // );
    //
    // if (paymentSuccess) {
    //   console.log('\n=== Payment Success ===');
    // }

    // 7. Get all reservations
    const allReservations = await srt.getReservations();
    console.log('\n=== All Reservations ===');
    allReservations.forEach(rsv => {
      console.log(rsv.toString());
    });

    // 8. Optional: Cancel reservation
    // await srt.cancel(reservation);
    // console.log('\n=== Reservation Cancelled ===');

    // 9. Logout
    await srt.logout();

  } catch (error) {
    console.error('Error:', error);
  }
}

// Run the example
if (require.main === module) {
  main();
}
