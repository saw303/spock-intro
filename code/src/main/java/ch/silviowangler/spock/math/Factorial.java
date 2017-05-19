package ch.silviowangler.spock.math;

/**
 * @author Silvio Wangler
 */
public interface Factorial {

  static long of(long l) {

    if (l < 1L ) {
      return 1L;
    }
    else {
      return l * of(--l);
    }
  }
}
