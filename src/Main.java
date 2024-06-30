import java.util.*;
  public class Main {
      static Scanner sc = new Scanner(System.in);
      static int count = 1;
      static int cc=0;
      static ArrayList<String> details = new ArrayList<String>();
      static ArrayList<ArrayList<String>> info = new ArrayList();
      static ArrayList<String> passdetails = new ArrayList<String>();
      static ArrayList<Integer> total_balance = new ArrayList<Integer>();
     static ArrayList<String> empty = new ArrayList<String>();
    static ArrayList<String> arr = new ArrayList();
      static ArrayList<String> ra = new ArrayList();
    static int ID;
      static int actual = ID - 1;
     static ArrayList<String> use_check=new ArrayList<>();
      static ArrayList<String> update_check=new ArrayList<>();

      static class Create {
          public void creates() {
              String c = String.valueOf(count);
              details.add(c);
              sc.nextLine();
              System.out.print("Name: ");
              String name = sc.nextLine();
              details.add(name);
              System.out.print("Father's name: ");
              String fName = sc.nextLine();
              details.add(fName);
              System.out.print("Mobile no.: ");
              String mob = sc.nextLine();
              details.add(mob);
              System.out.print("Initial Balance: ");
              int bal = sc.nextInt();
              String b = String.valueOf(bal);
              details.add(b);
              sc.nextLine();
              System.out.println("\nHello " + details.get(1) + " ,please create a strong password");
              String pass = sc.nextLine();
              passdetails.add(cc,pass);
              System.out.println("Your account ID is:" + count);
              arr=(ArrayList)details.clone();
              details.clear();
              System.out.println(arr);
              info.add(cc,arr);
              count++;
              cc++;
              //System.out.println(info);
          }
      }

      static class Use {
          public void uses() {
              System.out.println("Please enter your Account ID:");
              int ID = sc.nextInt();
              System.out.println("Please enter your password:");
              sc.nextLine();
              String pass = sc.nextLine();
              int actual=ID-1;
              use_check=info.get(actual);
              String helper=use_check.get(0);
              int h=Integer.parseInt(helper);
              String p=passdetails.get(actual);
              if (h==ID && p.equals(pass)) {
                  Display display = new Display();
                  display.show();
              } else {
                  System.out.println("Wrong ID or password. Please try again!");
              }
          }
      }

      static class Display {
          public void show() {
              do {
                  System.out.println("Operation:");
                  System.out.println("1.Transfer money");
                  System.out.println("2.Deposit money");
                  System.out.println("3.Withdraw money");
                  System.out.println("4.Your Current Balance");
                  System.out.println("5.Exit");
                  int choice = sc.nextInt();

                  System.out.println("Please enter your Account ID: ");
                   ID = sc.nextInt();
                   sc.nextLine();
                  System.out.println("Please enter your password: ");
                  //sc.nextLine();
                  int actual = ID - 1;
                  String pass = sc.nextLine();
                  use_check=info.get(actual);
                  String helper=use_check.get(0);
                  int h=Integer.parseInt(helper);
                  String p=passdetails.get(actual);
                  switch (choice) {
                      case 1:
                          //System.out.println(info);
                          if (h==ID && p.equals(pass)) {
                              System.out.println("Enter the amount to be transfered");
                              int amt = sc.nextInt();
                              String sen = info.get(actual).get(4);
                              int s=Integer.parseInt(sen);
                              if (s < amt) {
                                  System.out.println("Insufficient balance");
                              } else {
                                  System.out.println("Enter the account no to which the amount is to be transferred:");
                                  int acctID = sc.nextInt();
                                  int actuall = acctID - 1;
                                  ra=info.get(actuall);
                                  if(ra.size()==1)
                                  {
                                      System.out.println("Account doesn't exits");
                                      return;
                                  }
                                      String rec  = info.get(actuall).get(4);
                                      int r=Integer.parseInt(rec);
                                      r += amt;
                                      String rb= String.valueOf(r);
                                      info.get(actuall).set(4,rb);
                                      s -= amt;
                                      String sb= String.valueOf(s);
                                      info.get(actual).set(4,sb);
                                      System.out.println("Current balance:" + info.get(actual).get(4));

                              }
                          } else {
                              System.out.println("Wrong ID or password. Please try again!");
                          }
                          break;
                      case 2:
                          if (h==ID && p.equals(pass)) {
                              System.out.println("Enter the amount to be deposited");
                              int deposit = sc.nextInt();
                              String dep = info.get(actual).get(4);
                              int d=Integer.parseInt(dep);
                              d += deposit;
                              String db= String.valueOf(d);
                              info.get(actual).set(4,db);
                              System.out.println("Current balance:" + info.get(actual).get(4));
                          } else {
                              System.out.println("Wrong ID or password. Please try again!");
                          }
                          break;
                      case 3:
                          if (h==ID && p.equals(pass)) {
                              String with = info.get(actual).get(4);
                              int w=Integer.parseInt(with);
                              if (w == 0) {
                                  System.out.println("Insufficient balance");
                              } else {
                                  System.out.println("Enter the amount to be withdrawn");
                                  int withdrawn = sc.nextInt();
                                  w -= withdrawn;
                                  String wb= String.valueOf(w);
                                  info.get(actual).set(4,wb);
                                  System.out.println("Current balance:" + info.get(actual).get(4));
                              }
                          } else {
                              System.out.println("Wrong ID or password. Please try again!");

                          }
                          break;
                      case 4:
                          if (h==ID && p.equals(pass)) {
                              System.out.println("Current balance:" + info.get(actual).get(4));
                          }
                          break;
                      case 5:
                          return;

                  }
              }
              while (true);
          }
      }

      static class Update extends Use {
          public void updation() {
              System.out.println("Please enter your Account ID:");
              ID = sc.nextInt();
              System.out.println("Please enter your password:");
              sc.nextLine();
              String password = sc.nextLine();
              int actual=ID-1;
              System.out.println(info.get(actual));
              do {
                  //int actual=ID-1;
                  update_check=info.get(actual);
                  String helper=update_check.get(0);
                  int h=Integer.parseInt(helper);
                  String p=passdetails.get(actual);
                  if (h==ID && p.equals(password)) {

                      System.out.println("Select the details u want to update:");
                      System.out.println("1.Name");
                      System.out.println("2.Father's Name");
                      System.out.println("3.Mobile No.");
                      System.out.println("4.Exit");
                      int changes = sc.nextInt();
                      sc.nextLine();
                      //int acc=ID-1;
                      switch (changes) {

                          case 1:
                              System.out.println("Enter the new name: ");
                              String new_name = sc.nextLine();
                              info.get(actual).set(1, new_name);
                              break;
                          case 2:
                              System.out.println("Enter the new father's name: ");
                              String new_fathername = sc.nextLine();
                              info.get(actual).set(2, new_fathername);
                              break;
                          case 3:
                              System.out.println("Enter the new Mobile No.: ");
                              String mobile = sc.nextLine();
                              info.get(actual).set(3, mobile);
                              break;
                          case 4:
                              return;
                      }
                      System.out.println(update_check);

                  }
              }
              while (true);
          }
      }

      static class Delete {
          public void delete_act() {
              System.out.println("Please enter your Account ID:");
              int ID = sc.nextInt();
              System.out.println("Please enter your password:");
              sc.nextLine();
              String pass = sc.nextLine();
              int actual=ID-1;
              use_check=info.get(actual);
              String helper=use_check.get(0);
              int h=Integer.parseInt(helper);
              String p=passdetails.get(actual);
              if (h==ID && p.equals(pass)) {
                  System.out.println("Are  you sure you want to delete your account: (yes/no)");
                  String d = sc.nextLine();
                  if (d.equals("yes")) {
                      info.remove(actual);
                      info.add(actual,empty);
                      empty.add("Deleted Account");
                      passdetails.remove(actual);
                      passdetails.add(actual,"Deleted Password");
                      System.out.println("Account deleted successfully");
                      System.out.println(info);
                  } else {
                      System.out.println("Account not deleted");
                  }
              } else {
                  System.out.println("Wrong ID or password. Please try again!");
              }
          }
      }


      public static void main(String[] args) {
          do {
              System.out.println("choices");
              System.out.println("1.Create Account");
              System.out.println("2.Use Account");
              System.out.println("3.Update Account");
              System.out.println("4.Delete Account");
              System.out.println("5.Exit");
              int choice = sc.nextInt();
              switch (choice) {
                  case 1:
                      Create create = new Create();
                      create.creates();
                      break;
                  case 2:
                      Use use = new Use();
                      use.uses();
                      break;
                  case 3:
                      Update update = new Update();
                      update.updation();
                      break;
                  case 4:
                      Delete delete = new Delete();
                      delete.delete_act();
                      break;
                  case 5:
                      System.exit(0);
              }
          }
          while (true);
      }
  }


  // string to integer - Integer.parseInt()
// integer to string - String.valueOf()