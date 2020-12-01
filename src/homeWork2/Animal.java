package homeWork2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class Animal {
    public String name;
    public int age;
    public String food;
    public String location;

 public void makeNoise(){
     System.out.println(this.name + " makeNoise");
 }
 public String eat(){
     return this.food;
 }
 public void sleep(){
     System.out.println(this.name+" is sleep");
 }

}
