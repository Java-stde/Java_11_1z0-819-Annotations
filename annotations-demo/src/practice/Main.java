package practice;

import practice.models.Engineer;
import practice.models.Person;

/**
 * @PROJECT annotations-demo
 * @Author Elimane on 24/05/2022
 */
public class Main {
  public static void main(String[] args) {
      Person engineer = new Engineer(1L, "Eric Johnson");
    System.out.println(engineer.details());
  }
}
