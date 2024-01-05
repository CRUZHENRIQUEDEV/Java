class aulapoo {
  public static void main(String[] args) {
    Cao2 cachorro = new Cao2();
    cachorro.setIdade(5);

    if(cachorro.VerificarIdade()){
      System.out.println("ele é idoso");
    }
    else{
      System.out.println("é novinho");
    }
  }
}