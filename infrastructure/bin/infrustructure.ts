#!/usr/bin/env node
import 'source-map-support/register';
import {App, Stack, Tags} from 'aws-cdk-lib';
import {InfrastructureJsStack} from '../lib/infrastructure-js-stack';
import {InfrastructureTableStack} from "../lib/infrastructure-table-stack";
import {InfrastructureJsArm64Stack} from "../lib/infrastructure-js-arm64-stack";

const app = new App();

const account_id = process.env.DEPLOY_TARGET_ACCOUNT;
const region = process.env.DEPLOY_TARGET_REGION
const environmentSettings = {account: account_id, region: region};

const stackNameTable = 'Kotlin-Lambda-JS-table';
const stackTable = new InfrastructureTableStack(app, stackNameTable, {
  stackName: stackNameTable,
  env: environmentSettings,
  description: 'Dynamo Table used for JS example',
});

const stackNameJS = 'Kotlin-Lambda-JS-example';
const stackJS = new InfrastructureJsStack(app, stackNameJS, {
  stackName: stackNameJS,
  env: environmentSettings,
  description: 'JS example',
});

const stackNameJSArm64 = 'Kotlin-Lambda-JS-Arm64-example';
const stackJSArm64 = new InfrastructureJsArm64Stack(app, stackNameJSArm64, {
  stackName: stackNameJSArm64,
  env: environmentSettings,
  description: 'JS Arm64 example',
});

for (const node of app.node.children) {
  if (node instanceof Stack) {
    Tags.of(node).add('Application ID', node.stackName);
  }
}