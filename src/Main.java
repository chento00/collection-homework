import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<Account> accountList=new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.println("1. Add account");
            System.out.println("2. Remove Account");
            System.out.println("3. Edit Account");
            System.out.println("4. Show Account infor");
            System.out.println("5. Exit");
            int op=scanner.nextInt();
            switch (op)
            {
                case 1:
                {
                    Account ac=new Account();
                    ac.input(scanner);
                    accountList.add(ac);
                }break;
                case 2:{
                    System.out.print("Enter ID to remove : ");
                    Integer id=scanner.nextInt();
                    for(int i=0;i<accountList.size();i++){
                        if(accountList.get(i).getId().equals(id)){
                            accountList.remove(i);
                            break;
                        }
                    }
                }break;
                case 3:{
                    System.out.print("Enter ID to remove : ");
                    Integer id=scanner.nextInt();
                    for(int i=0;i<accountList.size();i++){
                        if(accountList.get(i).getId().equals(id)){
                            Account ac=new Account();
                            ac.input(scanner);
                            accountList.set(i,ac);
                            break;
                        }
                    }
                }break;
                case 4:{

                    label:
                    do {
                        System.out.println("------ Show account information--------");
                        System.out.println("1. Ascending Order id");
                        System.out.println("2. Descending Order id");
                        System.out.println("3. Descender order by balanace");
                        System.out.println("4. Back");
                        int op1=scanner.nextInt();
                        switch (op1)
                        {
                            case 1:
                            {
                                Collections.sort(accountList, Comparator.comparing(Account::getId));
                                for(int i=0;i<accountList.size();i++){
                                    accountList.get(i).output();
                                }
                            }break;
                            case 2:
                            {
                                Collections.sort(accountList, Comparator.comparing(Account::getId).reversed());
                                for(int i=0;i<accountList.size();i++){
                                    accountList.get(i).output();
                                }
                            }break;
                            case 3:{
                                Collections.sort(accountList, Comparator.comparing(Account::getBalance).reversed());
                                for(int i=0;i<accountList.size();i++){
                                    accountList.get(i).output();
                                }
                            }break ;
                            case 4:{
                                break label;
                            }

                        }
                    }while (true);
                }break;
                case 5:
                {
                    System.exit(0);
                }break;
            }
        }while (true);
    }

}

