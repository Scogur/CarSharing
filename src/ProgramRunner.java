public class ProgramRunner {
    public static void main(String[] args){
        Office office_1 = new Office();
        office_1.addAdmin(1);
        office_1.addAdmin(2);
        office_1.addAdmin(3);
        System.out.println(office_1.getAdminIds());
        Office office_2 = new Office();
        office_2.addAdmin(4);
        office_2.addAdmin(5);
        office_2.addAdmin(6);
        System.out.println(office_2.getAdminIds());
        System.out.println(Office.getInstance());
    }
}
