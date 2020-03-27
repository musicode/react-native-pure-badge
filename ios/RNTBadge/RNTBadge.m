#import "RNTBadge.h"

@implementation RNTBadge

RCT_EXPORT_MODULE(RNTBadge);

RCT_EXPORT_METHOD(getBadge:(RCTPromiseResolveBlock)resolve reject:(RCTPromiseRejectBlock)reject) {
    resolve(@{
      @"badge": @(UIApplication.sharedApplication.applicationIconBadgeNumber),
    });
}

RCT_EXPORT_METHOD(setBadge:(int)value) {
    dispatch_async(dispatch_get_main_queue(), ^{
        UIApplication.sharedApplication.applicationIconBadgeNumber = value;
    });
}

@end
