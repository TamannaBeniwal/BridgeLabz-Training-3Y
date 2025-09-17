import java.util.Scanner;
public class MusicPlaylistManager {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter ");
        String[] songs ={"song1","song2","song3"};
        int choice;
        boolean run =true;
        while(run){
            System.out.println("play all songs");
            System.out.println("play a song by index");
            System.out.println("search for a song by name ");
            System.out.println("exit");
            System.out.println("enter a choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                System.out.println("\n play all songs");
                for(int i=0;i<songs.length;i++){
                    System.out.println((i+1) + ". " + songs[i]);
                }
                break;
                case 2:
                System.out.println("enter song index (1 - " + songs.length + "):");
                int index=sc.nextInt();
                if(index >= 1 && index<=songs.length){
                    System.out.println("now playing: " + songs[index-1]);
                }else{
                    System.out.println("invalid index");

                }
                break;
                case 3:
                System.out.println("enter song name to search: ");
                String search =sc.nextLine();
                boolean found =false;
                for(int i=0;i<songs.length;i++) {
                    if(songs[i].equalsIgnoreCase(search)){
                      System.out.println("song found at index " + (i + 1) + ": " + songs[i]);
                      found=true;
                      break;
                    }
                }
                if(!found){
                    System.out.println("song not found in playlist");
                }
                break;
                case 4:
                System.out.println("exiting");
                run = false;
                break;

                default:
                System.out.println("invalid choice");

            }
        }
        sc.close();
    }
    
}
