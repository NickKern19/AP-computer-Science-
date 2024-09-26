public static int numUnique(int a, int b, int c) { 
    if (a == b && b == c) 
    { 
    return 1;
    } 
    else if (a == b || b == c || a == c) { 
    return 2; 
    } 
    else { 
    return 3; 
    }
    }