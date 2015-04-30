if($ROWENTRY$ < $MATRIX$.rows && $COLENTRY$ < $MATRIX$.cols){
    $CODE$
} else {
    printf("\nTrying to access entry out of bounds in %s\n", $MATRIXID$);
}