package day01.practice;


	public class Cat {
	    // Attributes
	    private int Age;
	    private String color;
	    private String speaks;


	    // Getters and setters
	    public int Age() {
	        return Age;
	    }

	    public void setAge(int Age) {
	        this.Age = Age;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public String getSpeak() {
	        return speaks;
	    }

	    public void setSpeak(String speaks) {
	        this.speaks = speaks;
	    }
	    
	    
	    

	    // Main method to create Dog objects
	    public static void main(String[] args) {
	        // Create two Dog objects
	        Cat cat1 = new Cat();
	        cat1.setAge(4);
	        cat1.setColor("White");
	        cat1.setSpeak("Meow!");
	        
	        
	        Cat cat2 = new Cat();
	        cat2.setAge(3);
	        cat2.setColor("Black");
	        cat2.setSpeak("Meow!");
	        

	        // Print the attributes of each Dog
	        System.out.println("Cat 1:");
	        System.out.println("Age: " + cat1.Age());
	        System.out.println("Color: " + cat1.getColor());
	        System.out.println("Speaks: " + cat1.getSpeak());

	        System.out.println("Cat 2:");
	        System.out.println("Age: " + cat2.Age());
	        System.out.println("Color: " + cat2.getColor());
	        System.out.println("Speaks: " + cat2.getSpeak());
	    }
	}

