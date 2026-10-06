import kotlinx.coroutines.*

fun main() = runBlocking {
    /*val thread = SimpleThread()
	thread.start()

	val threadWithRunnable = Thread(SimpleRunnable())
	threadWithRunnable.start()*/

	/*val thread = Thread {
    	println("${Thread.currentThread()} has run.")
	}
	thread.start()*/

	/*runBlocking {
    	val job = launch(Dispatchers.Default) {
        	println("${Thread.currentThread()} has run.")
    	}
	}*/

	/*val job = GlobalScope.launch {
    	println("${Thread.currentThread()} has run.")
	}*/

	/*runBlocking {
    	val job = launch {
        	println("${Thread.currentThread()} has run.")
    	}
	}*/

	/*val deferred = async {
    	return@async "${Thread.currentThread()} has run."
	}*/

	/*val deferred = async(Dispatchers.Unconfinded, CoroutineStart.LAZY) {
    	println("${Thread.currentThread()} has run.")
    }*/
		
	val deferred = async(Dispatchers.IO) {
    	println("${Thread.currentThread()} has run.")
	}
    
    /*deferred.await()*/
    
    val result = deferred.await()
    println(result)

	runBlocking(newSingleThreadContext("dedicatedThread")) {
    	val result = deferred.await()
    	println(result)
	}
}

/*class SimpleThread: Thread() {
    public override fun run() {
        println("${Thread.currentThread()} has run.")
    }
}*/

class SimpleRunnable: Runnable {
   override fun run() {
       println("${Thread.currentThread()} has run.")
   } 
}
