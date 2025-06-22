package com.mengyi.multiple;

public class UserContextHolder {
    private static ThreadLocal<String> userDetails = new ThreadLocal<>();

    public void setUserDetails(String details){
        userDetails.set(details);
    }

    public void getUserDetails(){
        userDetails.get();
    }

    public void clear(){
        userDetails.remove();
    }

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            userDetails.set("wang");
            System.out.println("user details: " + userDetails.get());

            userDetails = null;
            System.gc();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
