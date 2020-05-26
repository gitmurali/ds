package com.murali.problems;

//greatest common denominator
public class GCD {
  public static void main(String[] args) {
    System.out.println(gcd(1701, 3768));
  }

  static int gcd(int a, int b){
    if (b == 0)
      return a;
    else
      return gcd(b, a % b);
  }
}
