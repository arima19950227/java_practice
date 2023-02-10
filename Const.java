class Const {
  public static void main(String args[]){
   Test person1 = new Test("有馬", "大地", 27, 1.8, 78.0);
   person1.printData();

  Test person2 = new Test("有馬", "緑咲", 22, 1.65, 54.0);
  person2.printData();

  Test person3 = new Test("有馬", "遙清", 0, 0.5, 0.5);
  person3.printData();

 Test.printCount();

  }
}