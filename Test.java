class Test {

  //クラスフィールド↓,staticをつける
  private static int count=0;

  //インスタンスフィールド↓
  private String firstName;
  private String middleName;
  private String lastName;
  private int age;
  private double height;
  private double weight;

  Test(String firstName,String lastName,int age,double height,double weight){

    //初期値0の値にインクリメントしていく
    Test.count++;

  //constでの引数をインスタンスフィールドの値に代入していく
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    this.height=height;
    this.weight=weight;
  }

  Test(String firstName,String middleName,String lastName,int age,double height,double weight){
    this(firstName,lastName,age,height,weight);
    this.middleName=middleName;
  }
  
  public String getMiddleName(){
    return this.middleName;
  }


  public String fullName(){
    if(this.middleName==null){
      return this.firstName+""+this.lastName;
    }else{
      return this.firstName+this.middleName+this.lastName;
    }
  }

  public double bmi(){
    return this.weight/this.height/this.height;
  }

  //出力するprintDataメソッド
  public void printData(){
    String fullName=this.fullName();
    double bmi=this.bmi();

    System.out.println("私の名前は"+fullName+"です");

    System.out.println("年齢は"+this.age+"歳です");

    //Math.round(引数)で四捨五入することができる
    System.out.println("BMIは"+Math.round(bmi)+"です");
  }

   public static void printCount(){
    System.out.println("合計"+Test.count+"人です");
  }

}