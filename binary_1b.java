package nomor_1;

import java.util.Scanner;
public class binary_1b {
    public static void main(String[] args) {
        int data[] = {3, 10, 4, 2,8, 13};
        int cari;
        int batasbawah = data.length - 1;
        int batasatas = 0;
        boolean ketemu = false;
        int stage = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Isi data adalah ");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        
        System.out.print("Masukan data yang akan di cari : ");
        cari = scan.nextInt();
        
        while((batasatas < batasbawah) && (!ketemu)){
            stage = (batasatas + batasbawah) / 2;
            System.out.println("Stage berada di : " + stage);
            
            if(data[stage] == cari){
                ketemu = true;
            }
            else{
                if(cari < data[stage]){
                    System.out.println("Cari di kiri");
                    batasbawah = stage--;
                }
                else{
                    System.out.println("Cari di kanan");
                    batasatas = stage++;
                }
            }
        }
        
        if(ketemu){
            System.out.println("Data "+cari+" Telah ditemukan pada index ke "+ 
                              (stage + " dan baris ke "+ (stage + 1)));
        }
       else{
            System.out.println("Data " + cari + " Tidak Ditemukan");
        }
        
        System.out.println("\n");
        System.out.println("Zalfa Nadhifah");
        
}
}


