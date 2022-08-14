

//----------------------------------------------------------------Models------------------------------------------------------------------

//------------Ticket Model--------------
      

class Ticket{
   int id;
   String name;   
   String description;   
   Project assignedProject; // AssignedProject
   Set<TicketTag>ticketTags; // User defined labels & tags
   Milestone milestone; // Sprint
   Set<Ticket> dependentTickets;    
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

//Ticket Status      
enum Status{
    CREATED, IN_PROGRESS, CLOSED;
};          
      

//--------------User Model----------------

      
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

      
//--------------Audit Model----------------
      
      
class Audit{
      int aditId;
      Json Ticket ticket;
      String version;
      Status status;
      Date currentDate;
};
      
//-----------------------------------------------------------Controllers---------------------------------------------------------------  

class ProjectController{
      Project addProject(Project project);
      Project editProject(Project project);
      Project getProject(int projectId);
      List<Project> getProjectsByUserId(int userId); // User based projects
      List<Project> getAllProjects();
}


class TicketController{
      Ticket addTicket(Ticket Ticket);
      Ticket editTicket(Ticket Ticket);
      Ticket getTicket(int TicketId);
      List<Ticket> getTicketsByUserId(int userId); // User based tickets
      List<Ticket> getAllTickets();
      
}


class UserACMController{
      User addUser(User User);
      User editUser(User User);
      User getUser(int UserId);
      List<User> getAllUsers();
      List<UserRoles> getUserRoles(int UserId);
}


class MilestoneController{
      Milestone addMilestone(Milestone Milestone);
      Milestone editMilestone(Milestone Milestone);
      Milestone getMilestone(int MilestoneId);
      List<Milestone> getAllMilestones();
}

//-----------------------------------------------------------Interceptor---------------------------------------------------------------  

class UserACMInterceptor implements HandlerInterceptor{
   @Override
   public boolean preHandle(
      HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
         //User Authentication & Authorization
         //User role based access check
         //Module wise user access restriction
         //Action based user access restriction
      return true;
   }
   @Override
   public void postHandle(
      HttpServletRequest request, HttpServletResponse response, Object handler, 
      ModelAndView modelAndView) throws Exception {
               //Logs and Error handling
               //Audit handling
               //Response Formatters       
   }
}




      
      
      
      
      
      
      
