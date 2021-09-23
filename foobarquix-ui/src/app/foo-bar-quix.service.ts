import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http'
import {TestCase} from "./model/test-case";

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {

    constructor(private http: HttpClient) {
    }

    async convertNumber(testCase: TestCase): Promise<any> {
        const promise = new Promise((resolve, reject) => {
            this.http.get("http://localhost:8080/foo-bar-quix/" + testCase.input).toPromise()
                .then((res: any) => {
                    testCase.output = res['result'];
                }, error => {
                    console.log(error);
                })
        })

        return promise;
    }

}
