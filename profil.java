public class profil {

String nama;
String nim;
String kelas;
String email;
String hoby;


        public profil( String nama, String nim, String kelas, String email, String hoby) {
            this.nama  = nama;
            this.nim   = nim;
            this.kelas = kelas;
            this.email = email;
            this.hoby  = hoby;
        }
        public void displayinfo() {
            System.out.println("nama    :"  + nama);
            System.out.println("nim     :"   + nim);
            System.out.println("kelas   :" + kelas);
            System.out.println("email   :" + email);
            System.out.println("hoby    :"  + hoby);
        }

    public static void main(String[] args) {
        profil profil = new profil("M.Lukman Hakim", "12350113267", "D", "mlukmanh723@gmail.com", "berenang");
        profil.displayinfo();
    }

}
