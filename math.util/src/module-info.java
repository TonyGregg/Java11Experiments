/**
 * Created by Antony Genil Gregory on 11/20/2019 7:54 PM
 * For project : Java11Experiments
 **/module math.util {
     exports com.genil.math;
     exports com.science.cos to calculator;
     exports com.science.sin to pithagorams;
//     exports com.science.sin to calculator; // uncommenting will result in error
//     exports com.science.sin; // uncommenting will result in error
     // if this to be exported only to calculator module then enable below and comment the 1st line starts with exports
//      exports com.genil.math to calculator;
}