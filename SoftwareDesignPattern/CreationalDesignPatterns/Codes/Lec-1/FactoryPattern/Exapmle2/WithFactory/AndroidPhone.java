// Step 2: Create concrete classes (Concrete Products)
class AndroidPhone implements Phone {
    @Override
    public void display() {
        System.out.println("Android Phone");
    }
}