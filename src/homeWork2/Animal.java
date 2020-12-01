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
    private String name;
    private int age;
    private String food;
    private String location;

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
