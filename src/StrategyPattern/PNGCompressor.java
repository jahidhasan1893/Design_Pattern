package StrategyPattern;

public class PNGCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println(fileName+" is Compressing using PNG");
    }
}
