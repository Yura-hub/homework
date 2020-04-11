public class Sudoku {

    public static void main(String[] args){

        Lib ab = new Lib();
        ab.loadArgs(args);//传入参数
        ab.readFile();//读取文件
        ab.writeFile(false);
        for(int i =0; i < Lib.n; i++) {
            ab.getAndDO(i);//取得第i个数独表进行求解
            ab.writeFile(true);//将结果写入指定文件中
        }
    }
}