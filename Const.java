class Const {
  public static void main(String args[]){
   Test person1 = new Test("有馬", "大地", 27, 1.8, 78.0,"フリーター");
   person1.printData();

  Test person2 = new Test("有馬","マイケル", "緑咲", 22, 1.65, 54.0,"キャバ嬢");
  person2.printData();

  Test person3 = new Test("有馬", "遙清", 0, 0.5, 0.5,"赤ちゃん");
  person3.printData();

  person1.setMiddleName("ボブ");
  person1.setJob("総理大臣");

 Test.printCount();

 System.out.println("----------------");
 System.out.println("有馬緑咲のミドルネームは"+person2.getMiddleName()+"です");
 System.out.println("person1のミドルネームを"+person1.getMiddleName()+"に変更しました");
 System.out.println("perons1の職業を"+person1.getJob()+"に変更しました");

 person1.printData();

  }
}