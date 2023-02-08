class Const {
  public static void main(String args[]){
   Test person1 = new Test("有馬", "大地", 27, 1.8, 78.0);

    System.out.println(person1.fullName());
    System.out.println(person1.age);
    System.out.println(person1.bmi());

  }
}