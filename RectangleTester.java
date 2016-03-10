/*
 * [A]100
 * [TA's advise]
 * 1.使用float的變數挺精準的, 也適合使用這種小程式使用, 這部分有別於其他同學, 很不錯!
 * 2.有使用到String.format的手法, 下次可以試試看用printf達成一樣的效果
 * 3.加入try-catch的例外處理很好!
 * 4.下次請依照題目要求格式將字串印出, 這次不予以扣分.
 * 5.想想看Rectangle類別中method使用public的修飾字是否有其必要性或是程式安全性的疑慮呢?
 * 6.建議加入空白建構子, 而建構子不需要加入public的修飾字 
 * */

import java.util.*;

class Rectangle {

	float height, weight, x, y;

	public Rectangle(float a, float b, float c, float d) {
		height = a;
		weight = b;
		x = c;
		y = d;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public String toString() {
		String a = "height=%.2f,weight=%.2f,x=%.2f,y=%.2f";
		String b = "\nArea=%.2f";
		String c = "\nPerimeter=%.2f";
		return String.format(a, height, weight, x, y) + String.format(b, height * weight)
				+ String.format(c, height * 2 + weight * 2);
	}
}

public class RectangleTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Please code in the details of Rectangle one.");
			System.out.print("Height:");
			float h1 = input.nextFloat();
			System.out.print("Width:");
			float w1 = input.nextFloat();
			System.out.print("x:");
			float x1 = input.nextFloat();
			System.out.print("y:");
			float y1 = input.nextFloat();
			Rectangle abc = new Rectangle(h1, w1, x1, y1);
			System.out.print(abc.toString());
			System.out.println("\n\nPlease code in the details of Rectangle two.");

			System.out.print("Height:");
			float h2 = input.nextFloat();
			System.out.print("Width:");
			float w2 = input.nextFloat();
			System.out.print("x:");
			float x2 = input.nextFloat();
			System.out.print("y:");
			float y2 = input.nextFloat();
			Rectangle two = new Rectangle(h2, w2, x2, y2);
			System.out.print(two.toString());
		} catch (Exception e) {
			System.out.println("Error ! Please try again !");
		}
	}
}
