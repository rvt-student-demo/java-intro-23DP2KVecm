package lv.rvt;

class BoxTester
{

  public static void main ( String[] args )
  {
     Box originalBox = new  Box( 2.5, 5.0, 6.0 ) ;

     System.out.println("originalbox: " + originalBox);    

     Box biggerBox = originalBox.biggerBox(originalBox);
     Box smallerBox = originalBox.smallerBox(originalBox);
    
     System.out.println( "biggerbox: " + biggerBox);

     System.out.println( "smallerbox: " + smallerBox);
  }
}