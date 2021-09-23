import {Component, OnDestroy, OnInit} from '@angular/core';
import {FooBarQuixService} from '../foo-bar-quix.service';
import {TestCase} from "../model/test-case";

@Component({
    selector: 'app-foo-bar-quix',
    templateUrl: './foo-bar-quix.component.html'
})
export class FooBarQuixComponent implements OnInit, OnDestroy {

    constructor(private fooBarQuixService: FooBarQuixService) {
    }

    inputText: number;
    arr: Array<string> = [];

    ngOnInit(): void {
    }

    ngOnDestroy(): void {
    }

    convertNumber(inputNumber: TestCase): void {
        let result = inputNumber.output + " is the output of " + inputNumber.input;
        this.arr.push(result)
    }

}

interface NumberConverted {
    numberToConvert: number;
    result: string;
}
