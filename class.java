package bibekjaiswal;

	class shape{
	    public void draw()
	    {
	        System.out.println("Drawing a shape");
	    }
	    public void erase()
	    {
	        System.out.println("Erasing a shape");
	    }
	}
	    class Circle extends shape{
	        public void draw(){
	            System.out.println("Drawing a circle");
	        }
	        public void erase()
	        {
	            System.out.println("Erasing a circle");
	        }
	    }
	        class triangle extends shape{
	            public void draw()
	            {
	                System.out.println("Drawing a triangle");
	            }
	            public void erase(){
	                System.out.println("Erasing a triangle");
	            }
	        }
	            class square extends shape
	            {
	                public void draw()
	                {
	                    System.out.println("Drawing a square");
	                }
	                public void erase()
	                {
	                    System.out.println("Erasing a square");
	                }
	            }
	            
	                 public  class Main {
	                    public static void main(String[]args)
	                    {
	                        shape[]shapes=new shape[3];
	                        shapes[0]=new Circle();
	                        shapes[1]=new triangle();
	                        shapes[2]=new square();
	                        for (shape shape:shapes)
	                        {
	                            shape.draw();
	                            shape.erase();
	                            System.out.println();
	                        }
	                    }
	                }
	                
