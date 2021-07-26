public double value(Node n){
    if(n.type == NUMBER){
        return n.number;
    }else{
        double a = value(n.left)
        double b = value(n.left)
        if(n.operator=="+")
            return a+b;
        else if(n.operator=="-")
            return a-b;
        else if(n.operator=="*")
            return a*b;
        else if(n.operator=="/")
            return a/b;
    }
}
