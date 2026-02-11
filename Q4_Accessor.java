package com.java.javacodingprograms.Encapsulations;
class Sample {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
	public void setData(double d) {
		// TODO Auto-generated method stub
		
	}
	public char[] getData() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class Q4_Accessor {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.setValue(10);
        System.out.println(s.getValue());
    }
}