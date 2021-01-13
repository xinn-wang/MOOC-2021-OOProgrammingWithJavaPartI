
public class Statistics {
    private int count;
    private int sum;
    
    
    
    public Statistics () {
        this.count = 0;
        this.sum = 0;
    }
    
    public void addNumber (int number){
        this.count++;
        this.sum = sum + number;
        
        
    }
    
    public int getCount (){
        return count;   
    }
    
    public int sum (){
        return sum;
    }
    
    public double average (){
        if(getCount () == 0){
            return 0;
        }
        return (double) sum() / getCount();
    }
}
