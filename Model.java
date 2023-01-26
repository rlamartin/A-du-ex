package dungeonexca;
 // It should be noted that this code was copy and pasted from this site: https://www.edureka.co/blog/mvc-architecture-in-java/
// We put this code here as we plan to use it in the future as a basis and reference for our own model
public class Course {
       private String CourseName;
       private String CourseId;
       private String CourseCategory;
        
       public String getId() {
          return CourseId;
       }
        
       public void setId(String id) {
          this.CourseId = id;
       }
        
       public String getName() {
          return CourseName;
       }
        
       public void setName(String name) {
          this.CourseName = name;
       }
        
       public String getCategory() {
              return CourseCategory;
           }
        
       public void setCategory(String category) {
              this.CourseCategory = category;
           }
        
    }
