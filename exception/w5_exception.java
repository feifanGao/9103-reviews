public void imGonnaCrash() throws Exception { 
    throw new Exception("Definitely crashing!");
}

public static void main(String[] args) { 
    try {
        imGonnaCrash();
    } catch(Exception e) { 
        e.printStackTrace();
    }
}
