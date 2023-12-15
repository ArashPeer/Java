package Access_Modifers;

 class Private_ex {
    private void display(){
         System.out.println("Hello World");
     }

     //The private access modifier is only working within itself class not out of this
     public static void main(String[] args) {
         Private_ex test1 = new Private_ex();
         test1.display();
     }
}
