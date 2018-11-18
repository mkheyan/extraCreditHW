public class Class3 {
    int first,second;
    Class3(int first,int second){
        this.first=first;
        this.second=second;
    }
    
    
    double sin(){
        return Math.sin(first);
    }
    
    double cos(){        
        return Math.cos(second);
    }
    
    double tan(){
        return sin()/cos();}
    
}
