
#----------------------------------------Defining Models---------------------------------------------
#------------Ticket Model--------------
      
class Ticket{
   int id;
   String name;   
   String description;   
   Project assignedProject; // AssignedProject
   Set<TicketTag>ticketTags; // User defined labels & tags
   Milestone milestone; // Sprint
   Set<Ticket> dependentTickets; // DAG   
   Date startDate;
   Date endDate;
   Date estimatedDate;   
   Status status;     
};

//Ticket assigned users      
class UserTickets{
      User user;
      Ticket ticket;      
 }     
      
//Labels & Identifiers      
class TicketTag{
   int id;
   int name;   
};

//Code & Repository      
class Project{
    int id;
    String name;    
    String storeURL;
    String version;  
};
  
//Sprint creation      
class Milestone{
    int id;
    String name; 
    Date startDate;
    Date endDate;  
};
      
enum Status{
    CREATED, IN_PROGRESS, CLOSED;
};          
      
#--------------User Model----------------
      
class Users{
   int id;
   String name;
   String email;
   List<UserRoles> userRoles;
   int Status;
};

class UsersRoles{
   int userId;
   Role role;
   List<RoleActions> roleActions;
};

class RoleActions{
      Module module;
      Action action;
};
      
enum Role{
    ADMIN, MAINTANER, CHECKER, DEVELOPER;
};
      
enum Action{
    READ_ONLY, WRITE, APPROVE, CHECK;
};
      
enum Module{
    ADMIN_SCREEN, TICKET_SCREEN, REPO_SCREEN, MILESTONE_SCREEN,  DASHBOARD;
};      
      

      
      
      
      
