
public class User {

    private String location;
     private String room;
      private String appliances;
       private String engineer;
        private String date;
         private String service;
          private String phone;
           private String email;
            private String work;
            
            public User(String Location,String Room, String Appliances, String Engineer,String Date,String Service,String Phone,String Email,String Work){
                
                this.location = Location;
                this.room = Room;
                this.appliances = Appliances;
                this.engineer = Engineer;
                this.date = Date;
                this.service = Service;
                this.phone = Phone;
                this.email = Email;
                this.work = Work;
       }
            
            public String getLoc(){
                return location;
            }
            
             public String getRoom(){
                return room;
            }
             
              public String getApps(){
                return appliances;
            }
              
               public String getEng(){
                return engineer;
            }
               
                public String getDate(){
                return date;
            }
                
                 public String getServ(){
                return service;
            }
                 
                  public String getPh(){
                return phone;
            }
                  
                   public String getEM(){
                return email;
            }
                    public String getWRK(){
                return work;
            }
            
            
   
    
}
