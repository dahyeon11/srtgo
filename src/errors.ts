/**
 * Error classes for SRTgo
 */

export class SRTError extends Error {
  constructor(message: string) {
    super(message);
    this.name = 'SRTError';
    Object.setPrototypeOf(this, SRTError.prototype);
  }
}

export class SRTLoginError extends SRTError {
  constructor(message: string) {
    super(message);
    this.name = 'SRTLoginError';
    Object.setPrototypeOf(this, SRTLoginError.prototype);
  }
}

export class SRTResponseError extends SRTError {
  constructor(message: string) {
    super(message);
    this.name = 'SRTResponseError';
    Object.setPrototypeOf(this, SRTResponseError.prototype);
  }
}

export class SRTNotLoggedInError extends SRTError {
  constructor() {
    super('Not logged in');
    this.name = 'SRTNotLoggedInError';
    Object.setPrototypeOf(this, SRTNotLoggedInError.prototype);
  }
}

export class SRTNetFunnelError extends SRTError {
  constructor(message: string) {
    super(message);
    this.name = 'SRTNetFunnelError';
    Object.setPrototypeOf(this, SRTNetFunnelError.prototype);
  }
}

export class KorailError extends Error {
  code?: string;

  constructor(message: string, code?: string) {
    super(message);
    this.name = 'KorailError';
    this.code = code;
    Object.setPrototypeOf(this, KorailError.prototype);
  }

  toString(): string {
    return this.code ? `${this.message} (${this.code})` : this.message;
  }
}

export class NeedToLoginError extends KorailError {
  static codes = new Set(['P058']);

  constructor(code?: string) {
    super('Need to Login', code);
    this.name = 'NeedToLoginError';
    Object.setPrototypeOf(this, NeedToLoginError.prototype);
  }
}

export class NoResultsError extends KorailError {
  static codes = new Set(['P100', 'WRG000000', 'WRD000061', 'WRT300005']);

  constructor(code?: string) {
    super('No Results', code);
    this.name = 'NoResultsError';
    Object.setPrototypeOf(this, NoResultsError.prototype);
  }
}

export class SoldOutError extends KorailError {
  static codes = new Set(['IRT010110', 'ERR211161']);

  constructor(code?: string) {
    super('Sold out', code);
    this.name = 'SoldOutError';
    Object.setPrototypeOf(this, SoldOutError.prototype);
  }
}

export class NetFunnelError extends Error {
  constructor(message: string) {
    super(message);
    this.name = 'NetFunnelError';
    Object.setPrototypeOf(this, NetFunnelError.prototype);
  }
}
