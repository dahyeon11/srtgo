/**
 * Passenger classes for SRT and KTX
 */

import { WINDOW_SEAT } from './constants';

/**
 * SRT Passenger Base Class
 */
export abstract class Passenger {
  constructor(
    public name: string,
    public typeCode: string,
    public count: number
  ) {}

  toString(): string {
    return `${this.name} ${this.count}명`;
  }

  static combine(passengers: Passenger[]): Passenger[] {
    const passengerMap = new Map<string, Passenger>();

    for (const passenger of passengers) {
      const key = passenger.constructor.name;
      const existing = passengerMap.get(key);

      if (existing && existing.typeCode === passenger.typeCode) {
        existing.count += passenger.count;
      } else {
        passengerMap.set(key, passenger);
      }
    }

    return Array.from(passengerMap.values()).filter(p => p.count > 0);
  }

  static totalCount(passengers: Passenger[]): number {
    return passengers.reduce((sum, p) => sum + p.count, 0);
  }

  static getPassengerDict(
    passengers: Passenger[],
    specialSeat: boolean = false,
    windowSeat?: boolean
  ): { [key: string]: string } {
    const combined = Passenger.combine(passengers);
    const windowSeatCode = windowSeat === undefined ? 'none' : windowSeat.toString();

    const data: { [key: string]: string } = {
      totPrnb: this.totalCount(combined).toString(),
      psgGridcnt: combined.length.toString(),
      locSeatAttCd1: WINDOW_SEAT[windowSeatCode],
      rqSeatAttCd1: '015',
      dirSeatAttCd1: '009',
      smkSeatAttCd1: '000',
      etcSeatAttCd1: '000',
      psrmClCd1: specialSeat ? '2' : '1'
    };

    combined.forEach((passenger, i) => {
      const idx = i + 1;
      data[`psgTpCd${idx}`] = passenger.typeCode;
      data[`psgInfoPerPrnb${idx}`] = passenger.count.toString();
    });

    return data;
  }
}

export class Adult extends Passenger {
  constructor(count: number = 1) {
    super('어른/청소년', '1', count);
  }
}

export class Child extends Passenger {
  constructor(count: number = 1) {
    super('어린이', '5', count);
  }
}

export class Senior extends Passenger {
  constructor(count: number = 1) {
    super('경로', '4', count);
  }
}

export class Disability1To3 extends Passenger {
  constructor(count: number = 1) {
    super('장애 1~3급', '2', count);
  }
}

export class Disability4To6 extends Passenger {
  constructor(count: number = 1) {
    super('장애 4~6급', '3', count);
  }
}

/**
 * KTX Passenger Base Class
 */
export abstract class KTXPassenger {
  constructor(
    public typecode: string,
    public count: number = 1,
    public discountType: string = '000',
    public card: string = '',
    public cardNo: string = '',
    public cardPw: string = ''
  ) {}

  groupKey(): string {
    return `${this.typecode}_${this.discountType}_${this.card}_${this.cardNo}_${this.cardPw}`;
  }

  getDict(index: number): { [key: string]: string | number } {
    return {
      [`txtPsgTpCd${index}`]: this.typecode,
      [`txtDiscKndCd${index}`]: this.discountType,
      [`txtCompaCnt${index}`]: this.count,
      [`txtCardCode_${index}`]: this.card,
      [`txtCardNo_${index}`]: this.cardNo,
      [`txtCardPw_${index}`]: this.cardPw
    };
  }

  static reduce(passengers: KTXPassenger[]): KTXPassenger[] {
    const groups = new Map<string, KTXPassenger>();

    for (const passenger of passengers) {
      const key = passenger.groupKey();
      const existing = groups.get(key);

      if (existing) {
        existing.count += passenger.count;
      } else {
        groups.set(key, passenger);
      }
    }

    return Array.from(groups.values()).filter(p => p.count > 0);
  }
}

export class AdultPassenger extends KTXPassenger {
  constructor(
    count: number = 1,
    discountType: string = '000',
    card: string = '',
    cardNo: string = '',
    cardPw: string = ''
  ) {
    super('1', count, discountType, card, cardNo, cardPw);
  }
}

export class ChildPassenger extends KTXPassenger {
  constructor(
    count: number = 1,
    discountType: string = '000',
    card: string = '',
    cardNo: string = '',
    cardPw: string = ''
  ) {
    super('3', count, discountType, card, cardNo, cardPw);
  }
}

export class ToddlerPassenger extends KTXPassenger {
  constructor(
    count: number = 1,
    discountType: string = '321',
    card: string = '',
    cardNo: string = '',
    cardPw: string = ''
  ) {
    super('3', count, discountType, card, cardNo, cardPw);
  }
}

export class SeniorPassenger extends KTXPassenger {
  constructor(
    count: number = 1,
    discountType: string = '131',
    card: string = '',
    cardNo: string = '',
    cardPw: string = ''
  ) {
    super('1', count, discountType, card, cardNo, cardPw);
  }
}

export class Disability1To3Passenger extends KTXPassenger {
  constructor(
    count: number = 1,
    discountType: string = '111',
    card: string = '',
    cardNo: string = '',
    cardPw: string = ''
  ) {
    super('1', count, discountType, card, cardNo, cardPw);
  }
}

export class Disability4To6Passenger extends KTXPassenger {
  constructor(
    count: number = 1,
    discountType: string = '112',
    card: string = '',
    cardNo: string = '',
    cardPw: string = ''
  ) {
    super('1', count, discountType, card, cardNo, cardPw);
  }
}
