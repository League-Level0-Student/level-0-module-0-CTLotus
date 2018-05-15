void setup(){
  double arr = findAreaofCircle(30);
  System.out.println(arr);
  double pi = 3.141592563;
  double radius = 30;
  double area = pi*radius*radius;
  println(area);
}

double findAreaofCircle(double radius){
  double pi = 3.141592563;
  double area = pi*radius*radius;
  return area;
}
