
public class Main {
    public static void main(String[] args) {
        Airforce airForce = new Airforce();

        CoustomIterator allPlanes = airForce.createIterator();

        while (allPlanes.hasNext()) {
            System.out.println(allPlanes.next());
        }

        // ArrayList<String> companyList = new ArrayList<>();
        // companyList.add("MS");
        // companyList.add("Amzn");
        //
        // //traversal - > iterator ka use karke
        // Iterator<String> it = companyList.iterator();
        // while(it.hasNext()) {
        // System.out.println(it.next());
        // }
    }
}