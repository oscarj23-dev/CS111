public class InsectDemo {
    public static void main(String[] args) {
        //creating new grasshopper and beetle objects
        Grasshopper hopper = new Grasshopper();
        Beetle beetle = new Beetle(true);
        hopper.setLifeSpanDays(12);
        hopper.setJumpDist(12.97);
        beetle.setLifeSpanDays(10);
        beetle.setStink(3);

        //printing out info of the grasshoppers and beetles
        System.out.println("The Grasshoppers Jump distance is: " + hopper.getJumpDist());
        System.out.println("The Grasshoppers life spane is: " + hopper.getLifeSpan());
        System.out.println("The Grasshoppers number of legs is: " + hopper.getNumLegs());
        System.out.println("The Beetle's life span is: " + beetle.getLifeSpan());
        System.out.println("The Beetle's number of legs is: " + beetle.getNumLegs());
        //if statement to determine whether the beetle is a stinkbug or not.
        if(beetle.getIsABigStink()) {
            System.out.println("The Beetle is a big stink!");
        } else {
            System.out.println("The Beetle is not a stink!");
        }
    }
}