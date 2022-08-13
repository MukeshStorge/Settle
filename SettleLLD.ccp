
#----------------------------------------Defining Models---------------------------------------------
#-----------------User------------------
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
      

      
      
      
