abstract class Shape
{
	abstract void numberofSides();
}

class Triangle extends Shape
{
	void numberofSides()
	{
		System.out.println("3 sides");
	}
}

class Rectangle extends Shape
{
	void numberofSides()
	{
		System.out.println("4 sides");
	}
}

class Pentagon extends Shape
{
	void numberofSides()
	{
		System.out.println("5 sides");
	}
}
class Polygon
{
	public static void main(String arr[])
{
	Triangle T=new Triangle();
	Rectangle R=new Rectangle();
	Pentagon P=new Pentagon();
	T.numberofSides();
	R.numberofSides();
	P.numberofSides();
}

}
