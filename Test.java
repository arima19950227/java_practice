class Test {

  public static int count=0;
  public String firstName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  Test(String firstName,String lastName,int age,double height,double weight){

    Test.count++;

    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    this.height=height;
    this.weight=weight;
  }

  public String fullName(){
    return this.firstName+this.lastName;
  }

  public double bmi(){
    return this.weight/this.height/this.height;
  }

  public void printData(){
    String fullName=this.fullName();
    double bmi=this.bmi();

    System.out.println("私の名前は"+fullName+"です");
    System.out.println("年齢は"+this.age+"歳です");
    System.out.println("BMIは"+Math.round(bmi)+"です");

  }

}