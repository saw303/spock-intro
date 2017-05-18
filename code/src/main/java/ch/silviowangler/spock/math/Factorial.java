package ch.silviowangler.spock.math;

/**
 * @author Silvio Wangler
 */
public class Factorial {

  public long calc(long l) {

    if (l < 1L ) {
      return 1L;
    }
    else {
      return l * calc(--l);
    }
  }
}
