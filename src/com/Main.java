package com;

public class Main {
    public static void main(String[] args) {
        CompositeEnrity compositeEnrity=new CompositeEnrity();
        for (String s:compositeEnrity.getData()) {
            System.out.println(s);
        }
    }
}
class DependentObject1{
    String getData(){
        return "one";
    }
}

class DependentObject2{
    String getData(){
        return "two";
    }
}
class CoarseGainedObject{
    DependentObject1 dependentObject1=new DependentObject1();
    DependentObject2    dependentObject2=new DependentObject2();
    public String[] getData(){
        return new String[]{dependentObject1.getData(),dependentObject2.getData() };
    }
}
class CompositeEnrity{
    CoarseGainedObject coarseGainedObject=new CoarseGainedObject();
    public String[] getData(){
      return  coarseGainedObject.getData();
    }
}











