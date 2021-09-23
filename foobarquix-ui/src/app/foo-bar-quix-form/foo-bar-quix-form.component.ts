import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {FooBarQuixService} from "../foo-bar-quix.service";
import {TestCase} from "../model/test-case";

@Component({
    selector: 'app-foo-bar-quix-form',
    templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {

    @Input() inputNumber: number;
    @Output() submitNumberOutput: EventEmitter<TestCase> = new EventEmitter();

    testCase: TestCase;

    constructor(private fooBArQuixService: FooBarQuixService) {
        this.testCase = new TestCase();
    }

    ngOnInit(): void {
    }

    submitNumber(): void {
        if (isNaN(this.testCase.input)) {
            this.testCase.output = "Error, Input should be number";
            this.submitNumberOutput.emit(this.testCase);
            return;
        }
        this.fooBArQuixService.convertNumber(this.testCase);
        setTimeout(() => {
            this.submitNumberOutput.emit(this.testCase);
        }, 300);

    }

}
