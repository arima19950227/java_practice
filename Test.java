class Test {
  public String name;

  Test(String name){
    System.out.println("インスタンスが生成されました");
    this.name=name;
  }
  
  public void hello(){
    System.out.println("私の名前は"+this.name+"です");
  }

}